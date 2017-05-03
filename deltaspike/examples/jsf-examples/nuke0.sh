GUID=`cf app grouped --guid`
cf curl /v2/apps/$GUID/instances/0 -X 'DELETE' 
