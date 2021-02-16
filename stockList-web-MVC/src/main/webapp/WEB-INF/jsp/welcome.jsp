<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>

<div class="container">
    <p>
        <font color="red">${errorMessage}</font>
    </p>
    <form action="/login" method="POST">
        <fieldset class="form-group">
            <label>Tax Payer Name</label> <input name="name" type="text"
                class="form-control" />
        </fieldset>
        <fieldset class="form-group">
            <label>Category</label> <input name="category" type="category"
                class="form-control" />
        </fieldset>
        <button type="submit" class="btn btn-success">Submit</button>
    </form>

</div>

<%@ include file="common/footer.jspf"%>