var conversionsApp = angular.module('conversionsApp', []);

conversionsApp.controller('conversionController' , function ($scope, $http) {
    $scope.home = "Conversion Controller";
    
    $scope.convert = function () {
        console.log("I've been pressed!");  
        $http.get("http://http://localhost:8090/convert?conversionType="+ $scope.conv.value +"&input=" + $scope.input_value)
            .then(function successCallback(response){
                $scope.response = response;
            }, function errorCallback(response){
                console.log("Unable to perform get request");
            });
    };
    
});