/**
 * Created by kiennguyen on 7/31/16.
 */
var demoApp = angular.module("demoApp",
    [
        'ui.router',
        'ngResource',
        'vcRecaptcha',
        'ngAnimate',
        'ngTouch',
        'ui.bootstrap',
        'registerModule',
        'resultModule',
        'popupModule'
    ]);

demoApp
    .run([
        '$rootScope', '$state', '$stateParams', function ($rootScope, $state, $stateParams) {
            $rootScope.$state = $state;
            $rootScope.$stateParams = $stateParams;
        }
    ])
    .config(function ($stateProvider) {
        $stateProvider
            .state('register', {
                templateUrl: 'resources/app/view/registration/register.html',
                controller: 'RegisterCtrl',
                controllerAs: 'registerCtrl'
            })
            .state('result', {
                templateUrl: 'resources/app/view/registration/result.html',
                controller: 'ResultCtrl',
                controllerAs: 'resultCtrl'
            });
    });
