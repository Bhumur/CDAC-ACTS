$(document).ready(function () {
  $("#hideBtn").click(function () {
    $("#box").hide();
  });

  $("#showBtn").click(function () {
    $("#box").show();
  });

  $("#toggleBtn").click(function () {
    $("#box").toggle();
  });

  $("#fadeBtn").click(function () {
    $("#box").fadeToggle();
  });

  $("#slideBtn").click(function () {
    $("#box").slideToggle();
  });

  $("#changeTextBtn").click(function () {
    $("#box").text("Text Changed!");
  });

  $("#addClassBtn").click(function () {
    $("#box").toggleClass("hidden");
  });

  $("#ajaxBtn").click(function () {
    $.get("https://jsonplaceholder.typicode.com/posts/1", function (data) {
      $("#ajaxResult").html(
        "<strong>Title:</strong> " + data.title + "<br><strong>Body:</strong> " + data.body
      );
    });
  });
});
