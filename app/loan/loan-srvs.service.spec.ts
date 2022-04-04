import { TestBed } from '@angular/core/testing';

import { LoanSrvsService } from './loan-srvs.service';

describe('LoanSrvsService', () => {
  let service: LoanSrvsService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(LoanSrvsService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
