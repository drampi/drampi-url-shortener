import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from "@angular/common/http";

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { UrlDataService } from "./url-data.service";
import { UrlDataComponent } from './url-data/url-data.component';

@NgModule({
  declarations: [
    AppComponent,
    UrlDataComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [UrlDataService],
  bootstrap: [AppComponent]
})
export class AppModule { }
