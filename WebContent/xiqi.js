/**
 * 
 */
                
  				  var today=new Date();
  				  var day=today.getDay();
  				   switch(day){
				    case 1:document.getElementById("times").innerText="星期一";break;
					case 2:document.getElementById("times").innerText="星期二";break;
					case 3:document.getElementById("times").innerText="星期三";break;
					case 4:document.getElementById("times").innerText="星期四";break;
					case 5:document.getElementById("times").innerText="星期五";break;
					case 6:document.getElementById("times").innerText="星期六";break;
					case 7:document.getElementById("times").innerText="星期日";break;
  				   }