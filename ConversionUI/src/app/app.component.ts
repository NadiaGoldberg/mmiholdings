import { Component, OnInit } from '@angular/core';
import { Conversions } from '../app/Conversions';
 import { SharedService } from './shared.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})

export class AppComponent implements OnInit {

  clickMessage = '';
  conversionType = '1';
  inputValue = '10';
  convertedValue = '';

  selectedOption: Conversions = new Conversions(1, 'millimeters to inches');

  conversions = [
     new Conversions(1, 'millimeters to inches' ),
     new Conversions(2, 'inches to millimeters ' ),
     new Conversions(3, 'kilometers to miles ' ),
     new Conversions(4, 'miles to kilometers '),
     new Conversions(5, 'kilogram to pounds '),
     new Conversions(6, 'pounds to kilogram ')
  ];

  constructor(private _sharedService: SharedService) {
  }

  ngOnInit() {
  }





  getValue(conversionsid) {
      this.selectedOption = this.conversions.filter((item)=> item.id === conversionsid)[0];
      this.conversionType = this.selectedOption.id.toString();
  }


  callConvertService() {
    this.convertedValue = '';
    this._sharedService.convertValue(this.conversionType, this.inputValue)
            .subscribe(
            convertedReturnedValue => {
                this.convertedValue = convertedReturnedValue;

            },
            error => {
                console.log('Error. The convertValue result value is as follows:');
                console.log(error);
            }
            );

  }


}
