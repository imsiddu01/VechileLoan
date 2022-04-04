import { TestBed } from '@angular/core/testing';

import { AdminSrvsService } from './admin-srvs.service';

describe('AdminSrvsService', () => {
  let service: AdminSrvsService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(AdminSrvsService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
