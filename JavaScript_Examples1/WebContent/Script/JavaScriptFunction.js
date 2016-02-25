/**
 * 
 */

function normalFunction(){
	alert("I am a Normal Function");
}

function withArgFunction(name){
	
	alert("welcome to javascript Functions: "+name);
}

function returnFunction(name) {
	return "Welcome to javaScript " + name;
}

function takeFunctionsAsArg(func){
	
	var revd=func;
	alert(revd.show());
}

function returningFunctions(){
	
	return {
		addClass:function(){ alert("Add Class Called");},
		removeClass:function(){ alert("remove Class Called");}		
	};
}