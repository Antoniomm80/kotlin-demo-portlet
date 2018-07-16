<%@ include file="init.jsp"%>

<portlet:actionURL name="processForm" var="processFormURL">
</portlet:actionURL>

    <c:if test="${not empty feedback}">
        ${feedback}
    </c:if>
	<aui:form role="form" action="${processFormURL}" method="POST">
    <c:set var="placeholder">
        <liferay-ui:message key="es.digio.portlet.kotlinsample.labels.placeholder"/>
    </c:set>
    <c:set var="submit">
            <liferay-ui:message key="es.digio.portlet.kotlinsample.labels.submit"/>
        </c:set>
    <div class="row-fluid">
        <input type="text" id="<portlet:namespace/>text" name="<portlet:namespace/>text" placeholder="${placeholder}">
    </div>
    <div class="row-fluid">
        <button type="submit" class="btn btn-primary">${submit}</button>
    </div>
</aui:form>