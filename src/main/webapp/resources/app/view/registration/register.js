/**
 * Created by kiennguyen on 8/19/16.
 */
var registerModule = angular.module("registerModule",
    [
        'vcRecaptcha',
        'ngAnimate',
        'ngTouch',
        'ui.bootstrap',
        'ui.bootstrap.tpls'
    ]);

registerModule.controller('RegisterCtrl', ['$scope', '$state', '$http', '$uibModal', 'vcRecaptchaService',
    function ($scope, $state, $http, $uibModal, vcRecaptchaService) {
        // var self = this;
        $scope.recaptchaResponse = null;
        var recaptchaVerified = false;

        $scope.siteKey = {
            key: "6Le8LyYTAAAAADnCBhmxEtyL4pxACDAqJ2nhV4aS"
        }

        $scope.submit = function () {
            if (recaptchaVerified) {
                $state.go("result");
            } else {
                $uibModal.open({
                    animation: true,
                    controller: 'PopupCtrl',
                    controllerAs: 'popupCtrl',
                    // template: '<h1>{{title}}</h1><div>{{message}}</div>',
                    templateUrl: 'resources/app/view/registration/popup.html',
                    resolve: {
                        title: function () {
                            return "Recaptcha Not Verified";
                        },
                        message: function () {
                            return "Your recaptcha has not been verified";
                        }
                    }
                });
            }
        }

        $scope.recaptchaOnCreateHandler = function (widgetId) {
            $scope.widgetId = widgetId;
        }

        $scope.recaptchaOnSuccessHandler = function (response) {
            $scope.recaptchaResponse = response;
            console.log(response);
            var request = {
                recaptchaResponse : response
            }

            var response = $http.post("verify-recaptcha", request);
            response.success(function (data, status, headers, config) {
                recaptchaVerified = data.success;
            });
            response.error(function (data, status, headers, config) {

            })
        }

        $scope.recaptchaTimeoutHandler = function () {
            console.log("Recaptcha timed out!");
            vcRecaptchaService.reload($scope.widgetId);
            $uibModal.open({
                animation: true,
                controller: 'PopupCtrl',
                controllerAs: 'popupCtrl',
                // template: '<h1>{{title}}</h1><div>{{message}}</div>',
                templateUrl: 'resources/app/view/registration/popup.html',
                resolve: {
                    title: function () {
                        return "Recaptcha Expired";
                    },
                    message: function () {
                        return "Your recaptcha has been expired. Please verify again";
                    }
                }
            });
        }
    }])