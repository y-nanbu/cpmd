$(function() {
  $('#primary-btn').click(function() {
    $.ajax({
      url: "/ftlsample/doSave"
    }).then(function(data) {
      alert();
      $('.content').text(data.content);
    });
  });
});