using ReactNative.Bridge;
using System;
using System.Collections.Generic;
using Windows.ApplicationModel.Core;
using Windows.UI.Core;

namespace File.Share.RNFileShare
{
    /// <summary>
    /// A module that allows JS to share data.
    /// </summary>
    class RNFileShareModule : NativeModuleBase
    {
        /// <summary>
        /// Instantiates the <see cref="RNFileShareModule"/>.
        /// </summary>
        internal RNFileShareModule()
        {

        }

        /// <summary>
        /// The name of the native module.
        /// </summary>
        public override string Name
        {
            get
            {
                return "RNFileShare";
            }
        }
    }
}
