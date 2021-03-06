package controllers

import javax.inject._
import play.api.mvc._

@Singleton
class VuejsController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {

  def index() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.app())
  }
}
