import { Injectable } from '@angular/core';
import { HttpClient } from "@angular/common/http";
import {Observable} from "rxjs";
import {UrlData} from "./url-data";

@Injectable({
  providedIn: 'root'
})
export class UrlDataService {

  private baseUrl = "http://localhost:8080/api/all-urls"

  constructor(private http: HttpClient) { }

  getAllUrls(): Observable<UrlData[]> {
    return this.http.get<UrlData[]>(`${this.baseUrl}`);
  }
}
