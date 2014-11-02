(function() {

  if (window.location.search.match(/embed/gi)) {

    if ( typeof $ !== 'undefined' ) {

      $(function() {

        $('body').css('background-color', 'transparent');
        
        $('.embed-hide').hide();

        $('.embed-center').css('text-align', 'center');
        
      })

    }

  }

})();