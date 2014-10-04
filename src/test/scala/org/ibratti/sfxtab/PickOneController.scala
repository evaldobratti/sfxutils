package org.ibratti.sfxtab

import javafx.fxml.FXML
import javafx.scene.control.{RadioButton, ToggleGroup}

class PickOneController extends InnerPanel {
  @FXML var radioGroup: ToggleGroup = _

  @FXML var bogsRadio: RadioButton = _
  @FXML var dolanRadio: RadioButton = _
  @FXML var goobyRadio: RadioButton = _

  override def name: String = "Pick :)"

  override def fxmlResource: String = "PickOneView.fxml"

  override def openingWithValue(param: Any): Unit = {
    val initialString = param.asInstanceOf[String]
    initialString match {
      case "Bogs" => radioGroup.selectToggle(bogsRadio)
      case "Dolan" => radioGroup.selectToggle(dolanRadio)
      case "Gooby" => radioGroup.selectToggle(goobyRadio)
      case _ => radioGroup.selectToggle(bogsRadio)
    }
  }

  def pickButton() = {
    closeWindow(radioGroup.getSelectedToggle.asInstanceOf[RadioButton].getText)
  }
}
