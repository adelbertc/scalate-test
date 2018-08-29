package scalatetest

import org.fusesource.scalate._

import scala.io.Source

object ScalateTest extends App {
  val templateEngine = new TemplateEngine()
  templateEngine.allowReload = false
  templateEngine.allowCaching = false

  val templateString = Source.fromFile("./test.mustache").getLines.mkString("\n")
  val templateSource = TemplateSource.fromText("test.mustache", templateString)
  val template = templateEngine.load(templateSource)

  val env = Map[String, Any](
    "envvars" -> Map[String, Any](
      "envvars_list" -> List(Map[String, Any]("envvar_name" -> "FOO", "envvar_value" -> 1024))
    )
  )
  val result = templateEngine.layout("", template, env)
  println(result)
}
