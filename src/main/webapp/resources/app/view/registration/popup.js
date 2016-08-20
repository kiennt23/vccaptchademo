/**
 * Created by kiennguyen on 8/19/16.
 */
var popupModule = angular.module("popupModule", []);

popupModule.controller('PopupCtrl', ['$scope', 'title', 'message', function ($scope, title, message) {
    // var self = this;
    $scope.title = title || 'Notice';
    $scope.message = message || 'There is some issues';
}])