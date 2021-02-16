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
            <label for="cat">Category</label> 
            

		<select name="category" type="category"
                class="form-control" id="cat">
  		<option value="volvo">Employee</option>
  		<option value="saab">Corporation</option>
  		<option value="mercedes">Small Business</option>
  		<option value="audi">Self Employee</option>
		</select>
            
          
        </fieldset>
        <button type="submit" class="btn btn-success">Submit</button>
    </form>

</div>

<%@ include file="common/footer.jspf"%>