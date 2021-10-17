$(document).ready(function() {
  $( ".shop__filter .selected" ).on( "click", function() {
    var selected = $(this).parents('.shop__filter');
    $(selected).find('.options__container').toggleClass('active');
  });

$( "#categoryContainer .option" ).on( "click", function() {
    var text = $('label', this).text();
    var selected = $('#categoryContainer').parents('.shop__filter');

    $(selected).find('.selected').html(text);
    //$('#newsetContainer .selected').html(text);

    $(selected).find('.options__container').removeClass('active');

});

$( "#newsetContainer .option" ).on( "click", function() {
  var text = $('label', this).text();
  var selected = $('#newsetContainer').parents('.shop__filter');

  $(selected).find('.selected').html(text);
  //$('#newsetContainer .selected').html(text);

  $(selected).find('.options__container').removeClass('active');

});

});

// selected cart

$(document).ready(function() {
  $( ".select .selected" ).on( "click", function() {
    var selected = $(this).parents('.select');
    $(selected).find('.options__container').toggleClass('active');
    $(selected).find('.selected').toggleClass('active');
  });

$( "#monthContainer .option" ).on( "click", function() {
    var text = $('label', this).text();
    var selected = $('#monthContainer').parents('.select');

    $(selected).find('.selected').html(text);
    //$('#newsetContainer .selected').html(text);

    $(selected).find('.options__container').removeClass('active');

});

$( "#yearContainer .option" ).on( "click", function() {
  var text = $('label', this).text();
  var selected = $('#yearContainer').parents('.select');

  $(selected).find('.selected').html(text);
  //$('#newsetContainer .selected').html(text);

  $(selected).find('.options__container').removeClass('active');

});

});
