import { Component, OnInit } from '@angular/core';
import { UrlDataService } from "../url-data.service";
import { UrlData } from "../url-data";

@Component({
  selector: 'app-url-data',
  templateUrl: './url-data.component.html',
  styleUrls: ['./url-data.component.css']
})
export class UrlDataComponent implements OnInit {

  urlDataArr: UrlData[]
  constructor(private urlDataService: UrlDataService) { }

  ngOnInit(): void {
    this.urlDataService.getAllUrls().subscribe((data: UrlData[]) => {
      console.log(data);
      this.urlDataArr = data;
    });
  }

}
