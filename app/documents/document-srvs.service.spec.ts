import { TestBed } from '@angular/core/testing';

import { DocumentSrvsService } from './document-srvs.service';

describe('DocumentSrvsService', () => {
  let service: DocumentSrvsService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(DocumentSrvsService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
