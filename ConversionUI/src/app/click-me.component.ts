import { Component, OnInit  } from '@angular/core';
import { SharedService } from './shared.service';

@Component({
  selector: 'app-click-me',
  templateUrl: 'click.html'
})
export class ClickMeComponent implements OnInit  {
  clickMessage = '';
  conversionType = '10';
  inputValue = 10;
  convertedValue = '--';

  constructor(private _sharedService: SharedService) {
  }

  ngOnInit() {
  }


  callConvertService() {
    this._sharedService.convertValue(this.conversionType, this.inputValue)
            .subscribe(
            convertedValue => {
                this.convertedValue = convertedValue

            },
            error => {
                console.log('Error. The convertValue result value is as follows:');
                console.log(error);
            }
            );

  }
}
