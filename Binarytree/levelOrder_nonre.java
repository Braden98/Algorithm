 public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        if(root == null)
            return ans;
        int queue_size = 0;
        int level = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        //** 忘了加!**
      //  while(!queue.isEmpty()){
        while(!queue.isEmpty()){
            queue_size = queue.size();
            ans.add(new ArrayList<Integer>());
            while(queue_size-- != 0){
                //TreeNode t = queue.poll();
                TreeNode t = queue.remove();
                ans.get(level).add(t.val);
                if(t.left != null)
                    queue.add(t.left);
                if(t.right != null)
                    queue.add(t.right);
            }
            level++;
        }
        return ans;
    }
