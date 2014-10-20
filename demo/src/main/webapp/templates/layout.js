(function() {

  if (window.location.search.match(/embed/gi)) {

    if ($) {

      $(function() {

        $('.embed-hide').hide();

        $('.embed-center').css('text-align', 'center');
        
        $('.embed-zoom-13').css('zoom', '1.3');
        $('.embed-zoom-15').css('zoom', '1.5');
        $('.embed-zoom-17').css('zoom', '1.7');

      })

    }

  }

})();