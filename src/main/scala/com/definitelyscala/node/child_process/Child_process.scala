package com.definitelyscala.node.child_process

import scala.scalajs.js
import com.definitelyscala.node.Buffer
@js.native
@js.annotation.JSGlobal("child_process")
object Child_process extends js.Object {
  // specify `null`.
  // import * as events from "events";
  // import * as stream from "stream";
  // import * as net from "net";
  def spawn(command: String, args: js.Array[String] = js.native, options: SpawnOptions = js.native): ChildProcess = js.native
  def exec(command: String, callback: js.Function3[Error, String, String, Unit]): ChildProcess = js.native
  def exec(command: String, options: ExecOptionsWithStringEncoding, callback: js.Function3[Error, String, String, Unit]): ChildProcess = js.native
  // usage. child_process.exec("tsc", {encoding: null as string}, (err, stdout, stderr) => {});
  def exec(command: String, options: ExecOptionsWithBufferEncoding, callback: js.Function3[Error, Buffer, Buffer, Unit]): ChildProcess = js.native
  def exec(command: String, options: ExecOptions, callback: js.Function3[Error, String, String, Unit] = js.native): ChildProcess = js.native
  def execFile(file: String, callback: js.Function3[Error, String, String, Unit]): ChildProcess = js.native
  def execFile(file: String, options: ExecFileOptionsWithStringEncoding, callback: js.Function3[Error, String, String, Unit] = js.native): ChildProcess = js.native
  // usage. child_process.execFile("file.sh", {encoding: null as string}, (err, stdout, stderr) => {});
  def execFile(file: String, options: ExecFileOptionsWithBufferEncoding, callback: js.Function3[Error, Buffer, Buffer, Unit]): ChildProcess = js.native
  def execFile(file: String, options: ExecFileOptions, callback: js.Function3[Error, String, String, Unit]): ChildProcess = js.native
  def execFile(file: String, args: js.Array[String], callback: js.Function3[Error, String, String, Unit]): ChildProcess = js.native
  def execFile(file: String, args: js.Array[String], options: ExecFileOptionsWithStringEncoding, callback: js.Function3[Error, String, String, Unit]): ChildProcess = js.native
  // usage. child_process.execFile("file.sh", ["foo"], {encoding: null as string}, (err, stdout, stderr) => {});
  def execFile(file: String, args: js.Array[String], options: ExecFileOptionsWithBufferEncoding, callback: js.Function3[Error, Buffer, Buffer, Unit]): ChildProcess = js.native
  def execFile(file: String, args: js.Array[String], options: ExecFileOptions, callback: js.Function3[Error, String, String, Unit]): ChildProcess = js.native
  def fork(modulePath: String, args: js.Array[String] = js.native, options: ForkOptions = js.native): ChildProcess = js.native
  def spawnSync(command: String): SpawnSyncReturns[Buffer] = js.native
  def spawnSync(command: String, options: SpawnSyncOptionsWithStringEncoding): SpawnSyncReturns[String] = js.native
  def spawnSync(command: String, options: SpawnSyncOptionsWithBufferEncoding): SpawnSyncReturns[Buffer] = js.native
  def spawnSync(command: String, options: SpawnSyncOptions): SpawnSyncReturns[Buffer] = js.native
  def spawnSync(command: String, args: js.Array[String], options: SpawnSyncOptionsWithStringEncoding): SpawnSyncReturns[String] = js.native
  def spawnSync(command: String, args: js.Array[String], options: SpawnSyncOptionsWithBufferEncoding): SpawnSyncReturns[Buffer] = js.native
  def spawnSync(command: String, args: js.Array[String] = js.native, options: SpawnSyncOptions = js.native): SpawnSyncReturns[Buffer] = js.native
  def execSync(command: String): Buffer = js.native
  def execSync(command: String, options: ExecSyncOptionsWithStringEncoding): String = js.native
  def execSync(command: String, options: ExecSyncOptionsWithBufferEncoding): Buffer = js.native
  def execSync(command: String, options: ExecSyncOptions = js.native): Buffer = js.native
  def execFileSync(command: String): Buffer = js.native
  def execFileSync(command: String, options: ExecFileSyncOptionsWithStringEncoding): String = js.native
  def execFileSync(command: String, options: ExecFileSyncOptionsWithBufferEncoding): Buffer = js.native
  def execFileSync(command: String, options: ExecFileSyncOptions): Buffer = js.native
  def execFileSync(command: String, args: js.Array[String], options: ExecFileSyncOptionsWithStringEncoding): String = js.native
  def execFileSync(command: String, args: js.Array[String], options: ExecFileSyncOptionsWithBufferEncoding): Buffer = js.native
  def execFileSync(command: String, args: js.Array[String] = js.native, options: ExecFileSyncOptions): Buffer = js.native
}
