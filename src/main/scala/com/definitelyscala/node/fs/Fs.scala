package com.definitelyscala.node.fs

import scala.scalajs.js
import com.definitelyscala.node.Buffer
import com.definitelyscala.node.ErrnoException
import scala.scalajs.js.|
import scala.scalajs.js.Date
@js.native
@js.annotation.JSGlobal("fs")
object Fs extends js.Object {
  // import * as stream from "stream";
  // import * as events from "events";
  /**
   * Asynchronous rename.
   * @param oldPath
   * @param newPath
   * @param callback No arguments other than a possible exception are given to the completion callback.
   */
  def rename(oldPath: String, newPath: String, callback: js.Function1[ErrnoException, Unit] = js.native): Unit = js.native
  /**
   * Synchronous rename
   * @param oldPath
   * @param newPath
   */
  def renameSync(oldPath: String, newPath: String): Unit = js.native
  def truncate(path: String | Buffer, callback: js.Function1[ErrnoException, Unit]): Unit = js.native
  def truncate(path: String | Buffer, len: Double, callback: js.Function1[ErrnoException, Unit] = js.native): Unit = js.native
  def truncateSync(path: String | Buffer, len: Double = js.native): Unit = js.native
  def ftruncate(fd: Double, callback: js.Function1[ErrnoException, Unit]): Unit = js.native
  def ftruncate(fd: Double, len: Double, callback: js.Function1[ErrnoException, Unit] = js.native): Unit = js.native
  def ftruncateSync(fd: Double, len: Double = js.native): Unit = js.native
  def chown(path: String | Buffer, uid: Double, gid: Double, callback: js.Function1[ErrnoException, Unit] = js.native): Unit = js.native
  def chownSync(path: String | Buffer, uid: Double, gid: Double): Unit = js.native
  def fchown(fd: Double, uid: Double, gid: Double, callback: js.Function1[ErrnoException, Unit] = js.native): Unit = js.native
  def fchownSync(fd: Double, uid: Double, gid: Double): Unit = js.native
  def lchown(path: String | Buffer, uid: Double, gid: Double, callback: js.Function1[ErrnoException, Unit] = js.native): Unit = js.native
  def lchownSync(path: String | Buffer, uid: Double, gid: Double): Unit = js.native
  def chmod(path: String | Buffer, mode: Double, callback: js.Function1[ErrnoException, Unit]): Unit = js.native
  def chmod(path: String | Buffer, mode: String, callback: js.Function1[ErrnoException, Unit] = js.native): Unit = js.native
  def chmodSync(path: String | Buffer, mode: Double): Unit = js.native
  def chmodSync(path: String | Buffer, mode: String): Unit = js.native
  def fchmod(fd: Double, mode: Double, callback: js.Function1[ErrnoException, Unit]): Unit = js.native
  def fchmod(fd: Double, mode: String, callback: js.Function1[ErrnoException, Unit] = js.native): Unit = js.native
  def fchmodSync(fd: Double, mode: Double): Unit = js.native
  def fchmodSync(fd: Double, mode: String): Unit = js.native
  def lchmod(path: String | Buffer, mode: Double, callback: js.Function1[ErrnoException, Unit]): Unit = js.native
  def lchmod(path: String | Buffer, mode: String, callback: js.Function1[ErrnoException, Unit] = js.native): Unit = js.native
  def lchmodSync(path: String | Buffer, mode: Double): Unit = js.native
  def lchmodSync(path: String | Buffer, mode: String): Unit = js.native
  def stat(path: String | Buffer, callback: js.Function2[ErrnoException, Stats, Any] = js.native): Unit = js.native
  def lstat(path: String | Buffer, callback: js.Function2[ErrnoException, Stats, Any] = js.native): Unit = js.native
  def fstat(fd: Double, callback: js.Function2[ErrnoException, Stats, Any] = js.native): Unit = js.native
  def statSync(path: String | Buffer): Stats = js.native
  def lstatSync(path: String | Buffer): Stats = js.native
  def fstatSync(fd: Double): Stats = js.native
  def link(srcpath: String | Buffer, dstpath: String | Buffer, callback: js.Function1[ErrnoException, Unit] = js.native): Unit = js.native
  def linkSync(srcpath: String | Buffer, dstpath: String | Buffer): Unit = js.native
  def symlink(srcpath: String | Buffer, dstpath: String | Buffer, `type`: String = js.native, callback: js.Function1[ErrnoException, Unit] = js.native): Unit = js.native
  def symlinkSync(srcpath: String | Buffer, dstpath: String | Buffer, `type`: String = js.native): Unit = js.native
  def readlink(path: String | Buffer, callback: js.Function2[ErrnoException, String, Any] = js.native): Unit = js.native
  def readlinkSync(path: String | Buffer): String = js.native
  def realpath(path: String | Buffer, callback: js.Function2[ErrnoException, String, Any] = js.native): Unit = js.native
  def realpath(path: String | Buffer, cache: js.Dictionary[String], callback: js.Function2[ErrnoException, String, Any]): Unit = js.native
  def realpathSync(path: String | Buffer, cache: js.Dictionary[String] = js.native): String = js.native
  /*
     * Asynchronous unlink - deletes the file specified in {path}
     *
     * @param path
     * @param callback No arguments other than a possible exception are given to the completion callback.
     */
  def unlink(path: String | Buffer, callback: js.Function1[ErrnoException, Unit] = js.native): Unit = js.native
  /*
     * Synchronous unlink - deletes the file specified in {path}
     *
     * @param path
     */
  def unlinkSync(path: String | Buffer): Unit = js.native
  /*
     * Asynchronous rmdir - removes the directory specified in {path}
     *
     * @param path
     * @param callback No arguments other than a possible exception are given to the completion callback.
     */
  def rmdir(path: String | Buffer, callback: js.Function1[ErrnoException, Unit] = js.native): Unit = js.native
  /*
     * Synchronous rmdir - removes the directory specified in {path}
     *
     * @param path
     */
  def rmdirSync(path: String | Buffer): Unit = js.native
  /*
     * Asynchronous mkdir - creates the directory specified in {path}.  Parameter {mode} defaults to 0777.
     *
     * @param path
     * @param callback No arguments other than a possible exception are given to the completion callback.
     */
  def mkdir(path: String | Buffer, callback: js.Function1[ErrnoException, Unit]): Unit = js.native
  /*
     * Asynchronous mkdir - creates the directory specified in {path}.  Parameter {mode} defaults to 0777.
     *
     * @param path
     * @param mode
     * @param callback No arguments other than a possible exception are given to the completion callback.
     */
  def mkdir(path: String | Buffer, mode: Double, callback: js.Function1[ErrnoException, Unit]): Unit = js.native
  /*
     * Asynchronous mkdir - creates the directory specified in {path}.  Parameter {mode} defaults to 0777.
     *
     * @param path
     * @param mode
     * @param callback No arguments other than a possible exception are given to the completion callback.
     */
  def mkdir(path: String | Buffer, mode: String, callback: js.Function1[ErrnoException, Unit] = js.native): Unit = js.native
  /*
     * Synchronous mkdir - creates the directory specified in {path}.  Parameter {mode} defaults to 0777.
     *
     * @param path
     * @param mode
     * @param callback No arguments other than a possible exception are given to the completion callback.
     */
  def mkdirSync(path: String | Buffer, mode: Double | String): Unit = js.native
  /*
     * Asynchronous mkdtemp - Creates a unique temporary directory. Generates six random characters to be appended behind a required prefix to create a unique temporary directory.
     *
     * @param prefix
     * @param callback The created folder path is passed as a string to the callback's second parameter.
     */
  def mkdtemp(prefix: String, callback: js.Function2[ErrnoException, String, Unit] = js.native): Unit = js.native
  /*
     * Synchronous mkdtemp - Creates a unique temporary directory. Generates six random characters to be appended behind a required prefix to create a unique temporary directory.
     *
     * @param prefix
     * @returns Returns the created folder path.
     */
  def mkdtempSync(prefix: String): String = js.native
  def readdir(path: String | Buffer, callback: js.Function2[ErrnoException, js.Array[String], Unit] = js.native): Unit = js.native
  def readdirSync(path: String | Buffer): js.Array[String] = js.native
  def close(fd: Double, callback: js.Function1[ErrnoException, Unit] = js.native): Unit = js.native
  def closeSync(fd: Double): Unit = js.native
  def open(path: String | Buffer, flags: String | Double, callback: js.Function2[ErrnoException, Double, Unit]): Unit = js.native
  def open(path: String | Buffer, flags: String | Double, mode: Double, callback: js.Function2[ErrnoException, Double, Unit]): Unit = js.native
  def openSync(path: String | Buffer, flags: String | Double, mode: Double = js.native): Double = js.native
  def utimes(path: String | Buffer, atime: Double, mtime: Double, callback: js.Function1[ErrnoException, Unit]): Unit = js.native
  def utimes(path: String | Buffer, atime: Date, mtime: Date, callback: js.Function1[ErrnoException, Unit] = js.native): Unit = js.native
  def utimesSync(path: String | Buffer, atime: Double, mtime: Double): Unit = js.native
  def utimesSync(path: String | Buffer, atime: Date, mtime: Date): Unit = js.native
  def futimes(fd: Double, atime: Double, mtime: Double, callback: js.Function1[ErrnoException, Unit]): Unit = js.native
  def futimes(fd: Double, atime: Date, mtime: Date, callback: js.Function1[ErrnoException, Unit] = js.native): Unit = js.native
  def futimesSync(fd: Double, atime: Double, mtime: Double): Unit = js.native
  def futimesSync(fd: Double, atime: Date, mtime: Date): Unit = js.native
  def fsync(fd: Double, callback: js.Function1[ErrnoException, Unit] = js.native): Unit = js.native
  def fsyncSync(fd: Double): Unit = js.native
  def write(fd: Double, buffer: Buffer, offset: Double, length: Double, position: Double, callback: js.Function3[ErrnoException, Double, Buffer, Unit]): Unit = js.native
  def write(fd: Double, buffer: Buffer, offset: Double, length: Double, callback: js.Function3[ErrnoException, Double, Buffer, Unit]): Unit = js.native
  def write(fd: Double, data: js.Any, callback: js.Function3[ErrnoException, Double, String, Unit]): Unit = js.native
  def write(fd: Double, data: js.Any, offset: Double, callback: js.Function3[ErrnoException, Double, String, Unit]): Unit = js.native
  def write(fd: Double, data: js.Any, offset: Double, encoding: String, callback: js.Function3[ErrnoException, Double, String, Unit] = js.native): Unit = js.native
  def writeSync(fd: Double, buffer: Buffer, offset: Double, length: Double, position: Double): Double = js.native
  def writeSync(fd: Double, data: js.Any, position: Double = js.native, enconding: String = js.native): Double = js.native
  def read(fd: Double, buffer: Buffer, offset: Double, length: Double, position: Double, callback: js.Function3[ErrnoException, Double, Buffer, Unit] = js.native): Unit = js.native
  def readSync(fd: Double, buffer: Buffer, offset: Double, length: Double, position: Double): Double = js.native
  /*
     * Asynchronous readFile - Asynchronously reads the entire contents of a file.
     *
     * @param fileName
     * @param encoding
     * @param callback - The callback is passed two arguments (err, data), where data is the contents of the file.
     */
  def readFile(filename: String, encoding: String, callback: js.Function2[ErrnoException, String, Unit]): Unit = js.native
  /*
     * Asynchronous readFile - Asynchronously reads the entire contents of a file.
     *
     * @param fileName
     * @param options An object with optional {encoding} and {flag} properties.  If {encoding} is specified, readFile returns a string; otherwise it returns a Buffer.
     * @param callback - The callback is passed two arguments (err, data), where data is the contents of the file.
     */
  def readFile(filename: String, options: js.Any, callback: js.Function2[ErrnoException, Buffer, Unit]): Unit = js.native
  /*
     * Asynchronous readFile - Asynchronously reads the entire contents of a file.
     *
     * @param fileName
     * @param callback - The callback is passed two arguments (err, data), where data is the contents of the file.
     */
  def readFile(filename: String, callback: js.Function2[ErrnoException, Buffer, Unit]): Unit = js.native
  /*
     * Synchronous readFile - Synchronously reads the entire contents of a file.
     *
     * @param fileName
     * @param encoding
     */
  def readFileSync(filename: String, encoding: String): String = js.native
  /*
     * Synchronous readFile - Synchronously reads the entire contents of a file.
     *
     * @param fileName
     * @param options An object with optional {encoding} and {flag} properties.  If {encoding} is specified, readFileSync returns a string; otherwise it returns a Buffer.
     */
  /*
     * Synchronous readFile - Synchronously reads the entire contents of a file.
     *
     * @param fileName
     * @param options An object with optional {encoding} and {flag} properties.  If {encoding} is specified, readFileSync returns a string; otherwise it returns a Buffer.
     */
  def readFileSync(filename: String, options: js.Any = js.native): String | Buffer = js.native
  def writeFile(filename: String, data: js.Any, callback: js.Function1[ErrnoException, Unit]): Unit = js.native
  def writeFile(filename: String, data: js.Any, options: js.Any, callback: js.Function1[ErrnoException, Unit] = js.native): Unit = js.native
  def writeFileSync(filename: String, data: js.Any, options: js.Any = js.native): Unit = js.native
  def appendFile(filename: String, data: js.Any, options: js.Any, callback: js.Function1[ErrnoException, Unit]): Unit = js.native
  def appendFile(filename: String, data: js.Any, callback: js.Function1[ErrnoException, Unit] = js.native): Unit = js.native
  def appendFileSync(filename: String, data: js.Any, options: js.Any = js.native): Unit = js.native
  def watchFile(filename: String, listener: js.Function2[Stats, Stats, Unit]): Unit = js.native
  def watchFile(filename: String, options: js.Any, listener: js.Function2[Stats, Stats, Unit]): Unit = js.native
  def unwatchFile(filename: String, listener: js.Function2[Stats, Stats, Unit] = js.native): Unit = js.native
  def watch(filename: String, listener: js.Function2[String, String, Any]): FSWatcher = js.native
  def watch(filename: String, encoding: String, listener: js.Function2[String, String | Buffer, Any]): FSWatcher = js.native
  def watch(filename: String, options: js.Any, listener: js.Function2[String, String | Buffer, Any] = js.native): FSWatcher = js.native
  def exists(path: String | Buffer, callback: js.Function1[Boolean, Unit] = js.native): Unit = js.native
  def existsSync(path: String | Buffer): Boolean = js.native
  /** Tests a user's permissions for the file specified by path. */
  def access(path: String | Buffer, callback: js.Function1[ErrnoException, Unit]): Unit = js.native
  def access(path: String | Buffer, mode: Double, callback: js.Function1[ErrnoException, Unit]): Unit = js.native
  /** Synchronous version of fs.access. This throws if any accessibility checks fail, and does nothing otherwise. */
  def accessSync(path: String | Buffer, mode: Double = js.native): Unit = js.native
  def createReadStream(path: String | Buffer, options: js.Any = js.native): ReadStream = js.native
  def createWriteStream(path: String | Buffer, options: js.Any = js.native): WriteStream = js.native
  def fdatasync(fd: Double, callback: js.Function): Unit = js.native
  def fdatasyncSync(fd: Double): Unit = js.native
}
