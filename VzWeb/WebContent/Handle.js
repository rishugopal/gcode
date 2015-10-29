var req;
var active;
function onFoucsTextField(name)
{
	if(window.XMLHttpRequest)
		{
		req=new XMLHttpRequest();
		}
	else if(window.ActiveXObject)
		{
		req=new ActiveXObject("Microsoft.XMLHTTP");
		}
	//active=document.activeElement.name;
	var url="SuggestServlet?name="+name;
	
	req.onreadystatechange=getResponse;
	req.open("GET",url,true);
	req.send(null);


}
function getResponse()
{
if(req.readyState==4)
	{
	if(req.status==200)
		{
		//alert("hi");
		document.getElementById("product_suggest").innerHTML=req.responseText;
		var link=req.responseText;
		}
	}

}