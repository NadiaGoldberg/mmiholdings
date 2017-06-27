import { Injectable } from '@angular/core';
import { Http, Headers, Response } from '@angular/http';
import 'rxjs/Rx';
import { Observable } from 'rxjs/Observable';

@Injectable()
export class SharedService {
  conversionUrl = 'http://localhost:8010/convert';
  conversionTypeUrl = '?conversionType='
  conversionInputUrl = '&input=';
  fullConverstionURL = '';
 currencyURL = 'http://api.fixer.io/latest?symbols=';


  constructor(private _http: Http) { }

  convertValue(conversionType, conversionValue) {
    console.log('###########CALL BACKEND##############')
    this.fullConverstionURL = this.conversionUrl + this.conversionTypeUrl + conversionType + this.conversionInputUrl + conversionValue;
    console.log(this.fullConverstionURL);
     return this._http.get(this.fullConverstionURL)
            .map(response => {
                {return response.json() };
            })
            .catch(error => Observable.throw(error.toString()));
  }

}
