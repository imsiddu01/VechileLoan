import { TestBed } from '@angular/core/testing';

import { UserSrvsService } from './user-srvs.service';

describe('UserSrvsService', () => {
  let service: UserSrvsService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(UserSrvsService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
