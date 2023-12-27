class Find_duplicates{
    public:
     
      vector<int> duplicates(long long arr[], int n) {
          unordered_map<int,int>p;
          vector<int>x;
          for(int i=0;i<n;i++)
          {
              p[arr[i]]++;
          }
          for(auto i:p)
          {
              if(i.second>1)
              {
                  x.push_back(i.first);
              }
          }
          if(x.empty())
          {
          x.push_back(-1);
          return x;
          }
          else
          {
              sort(x.begin(),x.end());
          return x;
          }
      }
  };
  