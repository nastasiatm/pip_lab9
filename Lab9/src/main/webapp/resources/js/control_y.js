/**
 * Created by nasta_000 on 25.05.2016.
 */

function control_y() {
    var y_val = document.getElementById("form:Y").value;
    y_val = y_val.replace(",", ".");
    var y_valid = !((y_val == "") || !(!isNaN(parseFloat(y_val)) && isFinite(y_val)) || (y_val > 3) || (y_val < -3));
    if (y_valid) {
        document.getElementById("form:sendButton").disabled = false;
        document.getElementById("form:Y").style.borderColor = "#0a31bf";
        document.getElementById("form:sendButton").style.background = "#fb00ad";
    } else {
        document.getElementById("form:sendButton").disabled = true;
        document.getElementById("form:sendButton").style.background = "#EEEEEE";
        document.getElementById("form:Y").style.borderColor = "red";
    }
}