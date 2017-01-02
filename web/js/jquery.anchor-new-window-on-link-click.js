(function ($) {

    'use strict';
    $.fn.linkToNewWindow = function (options) {

        // default plugin settings
        var settings = $.extend({
            windowSize: "width=200,height=200,scrollbars=no"
        }, options);

        var result = this.click(function () {
            window.open(this.href, this.name, settings.windowSize);
            return false;
        });

        // return allows chaining to work.
        return result;
    };

}(jQuery));

