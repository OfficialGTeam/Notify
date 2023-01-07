import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './components/layout/header/header.component';
import { NewNoteComponent } from './components/pages/new-note/new-note.component';
import { CategoriesComponent } from './components/pages/categories/categories.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    NewNoteComponent,
    CategoriesComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
