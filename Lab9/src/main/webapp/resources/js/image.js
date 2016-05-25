/**
 * Created by nasta_000 on 24.05.2016.
 */
var d = function (e) {
    if (!e) var e = window.event;
    var width = 600;
    var height = 600;
    var x = e.offsetX == undefined ? e.layerX : e.offsetX - width / 2;
    var y = e.offsetY == undefined ? e.layerY : e.offsetY;
    if (y <= height / 2)
        y = height / 2 - y;
    else
        y = -y + height / 2;
    var rad;
    for (var i = 0; i <= 4; i++) {
        if (document.forms['form']['form:r'][i].checked) {
            rad = i + 1;
        }
    }
    if (!isNaN(rad)) {
        var k = rad * 1.2;//Magic number! 1-длина отрезка R, 1.2 - длина от 0 до края
        var l = 300;
        y = y * k / l;
        x = x * k / l;
    } else {
        alert("Set R first!");
        return;
    }
    document.getElementById('form:xMouse').value = x;
    document.getElementById('form:yMouse').value = y;
    document.getElementById('form:areaClickButton').click();
};