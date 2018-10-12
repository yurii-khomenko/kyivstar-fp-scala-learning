import java.io.{File, FileInputStream, InputStream}

def withFile(path: String)(block: InputStream => Unit): Unit = {

  var resource: InputStream = null

  try {

    resource = new FileInputStream(new File(path))

    block(resource)

  } catch {
    case t: Throwable => println("error: " + t)
  } finally {
    if(resource != null) resource.close()
  }
}

withFile("1.json") { resource =>
  val i = resource.read()
}