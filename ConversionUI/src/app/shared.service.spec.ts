import { TestBed, inject } from '@angular/core/testing';

import { SharedserviceService } from './shared.service';

describe('SharedService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [SharedserviceService]
    });
  });

  it('should be created', inject([SharedserviceService], (service: SharedserviceService) => {
    expect(service).toBeTruthy();
  }));
});
