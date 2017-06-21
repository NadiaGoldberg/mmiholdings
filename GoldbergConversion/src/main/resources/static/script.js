var app = angular.module("app", []);
app.controller("ConversionController", function($scope, $http) {
  	$scope.message = "Hello, AngularJS";
 	
 	$scope.convert = function() {		  
 		
 		$scope.convertedValue = "--";

        $http({
    		method : 'GET',
    		url : 'http://localhost:8090/convert?conversionType=' + $scope.convVal 
    		+ '&input=' + $scope.input_value
			}).then(function(response) {   	
    		
    			$scope.convertedValue = response.data
		
		});
            
    }
 
});