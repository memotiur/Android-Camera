# Android-Camera
এন্ড্রয়েডে ক্যামেরা নিয়ে কাজ করতে গেলে পারমিশন যোগ করতে হবে XML ফাইলে গিয়। 



আর জাভা ফাইলে ক্যামেরার জন্যে কোড হবে:

 public void camera(View v){
         Intent intent=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
         startActivityForResult(intent,0);
     }
     
     
     
ভিডিওর জন্যে :


    public void video(View v){
        Intent intent=new Intent(MediaStore.ACTION_VIDEO_CAPTURE);
        startActivityForResult(intent,0);
    }
