/**
 * 
 */

function checkname(name1){
	
	s=prompt("Is your name entered correctly",name1);
    document.getElementById('name').value=s;
	
}

function confirm(){
	var order_array=new Array();
	order_array.push(document.getElementById('name').value);
	order_array.push($('input[name=payment]:checked').val());
	order_array.push($( "#myselect option:selected" ).text());
	order_array.push($("input[type='checkbox']:checked").val());		
	alert("Dear Customer "+order_array[0]+'\n'+'Confirm Your Choices'+'\n'+'Payment:'+order_array[1]+'\n'+'Location:'+order_array[2]+'\n'+'Gifts:'+order_array[3]);
	
	submitted();
}

function submitted(){
	
	alert("thanks for confirming");
	
}
 