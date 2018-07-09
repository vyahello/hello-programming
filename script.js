function substitute() {
    var myValue = document.getElementById('myTextBox').value;
    if (myValue.length === 0) {
        alert('Please enter a real value in the text box');
        return;
    }
    var myTitle = document.getElementById('title');
    myTitle.innerHTML = myValue;
}


function add() {
    var tempValue = 0;
    for (i = 0; i < arguments.length; i ++)
    {
        tempValue += arguments[i]
    }
    return tempValue;
}
var myValue = add(1, 2, 3, 4);
alert(myValue);


var addme = function () {
    var tempValue = 0;
    for (i = 0; i < arguments.length; i++) {
        tempValue += arguments[i]
    }
    return tempValue;
}
alert(addme(5, 10, 15));


var addMeOnceMoreTime = (function () {
    return arguments[0] + arguments[1];
})(1, 3);
alert(addMeOnceMoreTime);
