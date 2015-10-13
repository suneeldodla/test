#!/bin/sh
xmlfile="sample.xml"
Path_Value=/appl/PLAYPEN_SANDBOX/Groceries_frontend/public
cd $Path_Value
Archive_Value=`ls *.gz | tail -1`
echo $Archive_Value
Build_Num=`ls *.gz | cut -d "." -f4`
echo $Build_Num
checksum_value=`cksum $Archive_Value | awk '{ print $1 }'`
echo $checksum_value
Version=`ls *.gz | cut -d "." -f1,2`
ActualVersion=`echo $Version | cut -d "-" -f2`
echo $ActualVersion
Time=`ls -ltr *.gz  | awk {'print $8'}`
echo $Time


sed "s/<TMPL_VAR_NAME>/$Archive_Value/g" -e "s/<TMPL_VAR_VERSION>/$ActualVersion/g" -e "s/<TMPL_VAR_BUILDNUMBER>/$Build_Num/g"
"s/<TMPL_VAR_BUILDNUMBER>/$Build_Num/g" "s/<TMPL_VAR_BUILDNUMBER>/$Build_Num/g" <$xmlfile > Grocery_Frontend_manifest.xml"
        #s/<TMPL_VAR_TYPE>/.gz/ \
        #s/<TMPL_VAR_PATH>/$Path_Value/g \
        #s/<TMPL_VAR_CHECKSUM>/$checksum_value/g \
        #s/<TMPL_VAR_ARTIFACTYPE>/.gz/g \
        #s/<TMPL_VAR_STATUS>/BUILT/g  \
        #s/<TMPL_VAR_BUILTTIME>/$Time/g" <$xmlfile > Grocery_Frontend_manifest.xml

