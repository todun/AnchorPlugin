(function ($) {

    'use strict';
    $.fn.linkToNewWindow = function (options) {

        // default plugin settings
        var settings = $.extend({
            windowSize: "width=200,height=200,scrollbars=no"
        }, options);

        var result = this.click(function () {
            var dataWindowGroup = $(this).attr('data-window-group');
            // open links with the same data-window-group in the same window
            window.open(this.href, dataWindowGroup, settings.windowSize);
            return false;
        });

        // return allows chaining to work.
        return result;
    };

}(jQuery));

