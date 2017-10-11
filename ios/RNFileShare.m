
#import "RNFileShare.h"

@implementation RNFileShare

- (dispatch_queue_t)methodQueue
{
    return dispatch_get_main_queue();
}
RCT_EXPORT_MODULE()

RCT_EXPORT_METHOD(shareFiles:(NSArray *)files) {
    
    
//    UIImage *image = [UIImage imageWithContentsOfFile:files[0]];
//    UIImage *imagea = [UIImage imageWithContentsOfFile:files[1]];
//
//    NSArray *items = @[image,imagea];
    
    UIViewController *rootViewController = [UIApplication sharedApplication].delegate.window.rootViewController;
    
    NSMutableArray *items = [[NSMutableArray alloc] init];

    
    for(int i=0; i< files.count ; i++) {
        UIImage *image = [UIImage imageWithContentsOfFile:files[i]];
        [items addObject:image];
        
    }
    
    
    
    
    UIActivityViewController *shareView = [[UIActivityViewController alloc]initWithActivityItems:items applicationActivities:nil];
    
    [shareView setCompletionWithItemsHandler:^(UIActivityType  _Nullable activityType, BOOL completed, NSArray * _Nullable returnedItems, NSError * _Nullable activityError) {
        
        if(completed) {
            UIAlertController* alert = [UIAlertController alertControllerWithTitle:@""
                                                                           message:@"Successfully Shared. "
                                                                    preferredStyle:UIAlertControllerStyleAlert];
            
            UIAlertAction* defaultAction = [UIAlertAction actionWithTitle:@"OK" style:UIAlertActionStyleDefault
                                                                  handler:^(UIAlertAction * action) {}];
            
            [alert addAction:defaultAction];
            [rootViewController presentViewController:alert animated:YES completion:nil];
        }
        
    }];
    
    // exclude several items
//    NSArray *excluded = @[UIActivityTypePostToFacebook, UIActivityTypePostToTwitter];
//    controller.excludedActivityTypes = excluded;
    
    // and present it
    //[self presentActivityController:controller];
    
    
    
    
    [rootViewController presentViewController:shareView animated:YES completion:nil];
    
    

    
}

@end
  
