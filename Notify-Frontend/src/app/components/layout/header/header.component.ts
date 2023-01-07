import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.sass']
})
export class HeaderComponent implements OnInit {

  constructor(
    private router:Router
  ) { 

  }

  ngOnInit(): void {
  
  }

  NewNote() {
    this.router.navigate(["newNote"]);
  }

  Categories() {
    this.router.navigate(["categories"]);
  }
}
