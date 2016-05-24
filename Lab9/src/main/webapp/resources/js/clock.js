/**
 * Created by nasta_000 on 24.05.2016.
 */

var timerId = setTimeout(function tick() {
    document.getElementById("clockForm:clockTimerBtn").click();
    timerId = setTimeout(tick, 5000);
}, 5000);