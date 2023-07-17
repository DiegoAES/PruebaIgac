import { Component, OnInit } from '@angular/core';
import { ServiceService } from '../service/service.service';

@Component({
  selector: 'app-lista',
  templateUrl: './lista.component.html',
  styleUrls: ['./lista.component.css']
})
export class ListaComponent implements OnInit {
  
  constructor( private service: ServiceService ){

  }

  public lista: any[] = []
  
  ngOnInit(): void {
    this.service.todos().subscribe( data => {
      console.log(data)
      data.forEach( d => {
        this.lista.push(d)
      })
      console.log(this.lista)
    })
  }



}
