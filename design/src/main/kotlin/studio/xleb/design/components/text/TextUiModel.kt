package studio.xleb.design.components.text

import studio.xleb.design.base.XlebUiModel

data class TextUiModel(
    val text: String,
    val id: String = "-1"
) : XlebUiModel {

    override fun getId(): String = id
}