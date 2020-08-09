import {EventEmitter, Input, Output} from '@angular/core';
import {NgForm} from '@angular/forms';
import * as lodash from 'lodash';
import {ConstantService} from '../service/constant.service';


export class ListTable<T> {

  public numeroRegistros: number;
  public selecao: T;
  public registro: T;
  public registros: T[];
  @Input() public form: NgForm;
  @Output() public oneSelected: EventEmitter<boolean> = new EventEmitter<boolean>();

  constructor(
    private constantService: ConstantService
  ) {
    this.numeroRegistros = constantService.quantidadeRegistrosLista;
  }

  isOneSelected(): void {
    this.oneSelected.emit(Boolean(this.selecao));
  }

  cleanSelection(): void {
    this.selecao = null;
    this.form.reset();
    this.isOneSelected();
  }

  enableEdit(): void {
    this.registro = lodash.cloneDeep(this.selecao);
  }

  disableEdit(): void {
    throw new Error('You have to implement the method doSomething!');
  }

}
