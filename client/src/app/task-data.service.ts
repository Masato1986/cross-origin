import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Task} from './task';
// TODO client-3 環境設定ファイルに定義してある定数をインポートする
import {environment} from "../environments/environment";

@Injectable({
  providedIn: 'root'
})
export class TaskDataService {

  constructor(private http: HttpClient) {
  }

  findAll(): Observable<Task[]> {
    // TODO client-4 非同期通信の通信先のURLは環境設定ファイルの値を使って生成する
    return this.http.get<Task[]>(environment.apiUrl + '/api/tasks');
  }
}
