import java.io.{File, FileInputStream, IOException}


val resource = new FileInputStream(new File("111.json"))
try {

  val i = resource.read()

} catch {
  case IOException => "error"
} finally {
  resource.close()
}