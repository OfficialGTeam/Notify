import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CategoriesComponent } from './components/pages/categories/categories.component';
import { NewNoteComponent } from './components/pages/new-note/new-note.component';

const routes: Routes = [
  {path:'newNote', component:NewNoteComponent},
  {path:'categories', component:CategoriesComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
