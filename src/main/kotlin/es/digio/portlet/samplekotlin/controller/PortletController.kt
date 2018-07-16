package es.digio.portlet.samplekotlin.controller

import com.liferay.portal.kernel.util.ParamUtil
import com.liferay.portal.kernel.util.StringPool
import com.liferay.util.bridges.mvc.MVCPortlet

import java.io.IOException
import javax.portlet.*

class PortletController : MVCPortlet() {
	companion object {
		const val FORM_ITEM_PARAM_NAME:String = "text"
		const val FEEDBACK_TEXT_ATTR_NAME:String = "feedback"
	}

	@Throws(IOException::class, PortletException::class)
	override fun doView(renderRequest: RenderRequest, renderResponse: RenderResponse) {
		super.doView(renderRequest, renderResponse)
	}

	fun processForm(actionRequest: ActionRequest, actionResponse: ActionResponse){
		val formItemValue = ParamUtil.get(actionRequest,FORM_ITEM_PARAM_NAME, StringPool.BLANK)
		actionRequest.setAttribute(FEEDBACK_TEXT_ATTR_NAME,formItemValue)
	}

}